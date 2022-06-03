package com.example.baitap4.controller.admin.category;

import com.example.baitap4.entity.Category;
import com.example.baitap4.entity.myenum.CategoryStatus;
import com.example.baitap4.entity.myenum.FormAction;
import com.example.baitap4.entity.myenum.MessageType;
import com.example.baitap4.entity.viewEntity.MessageView;
import com.example.baitap4.model.CategoryModel;
import com.example.baitap4.model.MySqlCategoryModel;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

public class CreateCategoryServlet extends HttpServlet {
    private CategoryModel categoryModel;

    @Override
    public void init() throws ServletException {
        categoryModel = new MySqlCategoryModel();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        List<Category> categoryList = categoryModel.findAll();
        req.setAttribute("categoryList", categoryList);
        req.getRequestDispatcher("/admin/category/form.jsp").forward(req, res);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        res.setCharacterEncoding("UTF-8");
        res.setContentType("text/html; charset=UTF-8");
        String name = req.getParameter("name");
        int status = Integer.parseInt(req.getParameter("status"));
        Category category = Category.CategoryBuilder.aCategory()
                .withName(name)
                .withStatus(CategoryStatus.of(status))
                .build2();
        if (category.isValid()) {
            HttpSession session = req.getSession();
            MessageView messageView = new MessageView();
            if(categoryModel.create(category)) {
                messageView.setMessageType(MessageType.SUCCESS);
                messageView.setContent("Create new category successfully !");
            }else {
                messageView.setMessageType(MessageType.ERROR);
                messageView.setContent("Create new category failed !");
            }
            session.setAttribute("message", messageView);
            res.sendRedirect("/admin/categories");
            return;
        }
        req.setAttribute("formAction", FormAction.CREATE);
        req.setAttribute("errors", category.getErrors());
        List<Category> categoryList = categoryModel.findAll();
        req.setAttribute("formAction", FormAction.CREATE);
        req.setAttribute("categoryList", categoryList);
        req.getRequestDispatcher("/admin/category/form.jsp").forward(req, res);

    }
}
