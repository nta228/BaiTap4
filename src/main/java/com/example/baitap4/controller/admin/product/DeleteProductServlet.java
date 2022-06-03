package com.example.baitap4.controller.admin.product;



import com.example.baitap4.entity.Product;
import com.example.baitap4.entity.myenum.MessageType;
import com.example.baitap4.entity.viewEntity.MessageView;
import com.example.baitap4.model.MySqlProductModel;
import com.example.baitap4.model.ProductModel;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class DeleteProductServlet extends HttpServlet {
    private ProductModel productModel;

    @Override
    public void init() throws ServletException {
        productModel = new MySqlProductModel();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        if(req.getParameter("id") == null) {
            req.getRequestDispatcher("/admin/errors/404.jsp").forward(req, res);
            return;
        }
        int id = Integer.parseInt(req.getParameter("id"));
        Product product = productModel.findById(id);
        if(product == null) {
            req.getRequestDispatcher("/admin/errors/404.jsp").forward(req, res);
            return;
        }
        MessageView messageView = new MessageView();
        HttpSession session = req.getSession();
        if(productModel.delete(id)) {
            messageView.setMessageType(MessageType.SUCCESS);
            messageView.setContent("Delete product successfully !");
        }else {
            messageView.setMessageType(MessageType.ERROR);
            messageView.setContent("Delete product failed !");
        }
        session.setAttribute("message", messageView);
        res.sendRedirect("/admin/products");
    }
}
