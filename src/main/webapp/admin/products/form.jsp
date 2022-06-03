<%@ page import="com.example.baitap4.entity.myenum.FormAction" %>
<%@ page import="java.util.HashMap" %>
<%@ page import="com.example.baitap4.entity.Category" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.example.baitap4.entity.Product" %>
<%@ page import="com.example.baitap4.entity.myenum.ProductStatus" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en" dir="ltr">
<jsp:include page="/admin/includes/head.jsp">
    <jsp:param name="title" value="Category - Create"/>
</jsp:include>
<%
    FormAction formAction = (FormAction) request.getAttribute("formAction");
    String action = "/admin/products/create";
    if (formAction == FormAction.UPDATE) {
        action = "/admin/products/update";
    }
    HashMap<String, String> errors = (HashMap<String, String>) request.getAttribute("errors");
    if (errors == null) {
        errors = new HashMap<>();
    }
    List<Category> categoryList = (List<Category>) request.getAttribute("categoryList");
    if (categoryList == null) {
        categoryList = new ArrayList<>();
    }
    Product product = (Product) request.getAttribute("product");
    if (product == null) {
        product = new Product();
    }
%>
<body class="fixed-navbar has-animation">
<div class="page-wrapper">
    <!-- START HEADER-->
    <header class="header">
        <div class="page-brand">
            <a class="link" href="index.html">
                    <span class="brand">TuanAnh
                        <span class="brand-tip">Web</span>
                    </span>
                <span class="brand-mini">TAW</span>
            </a>
        </div>
        <jsp:include page="/admin/includes/navbar.jsp"/>

        <jsp:include page="/admin/includes/main-sidebar.jsp"/>
    </header>
    <div class="content-wrapper">
        <!-- START PAGE CONTENT-->
        <div class="page-heading">
            <h1 class="page-title">Category</h1>
            <ol class="breadcrumb">
                <li class="breadcrumb-item">
                    <a href="index.html"><i class="la la-home font-20"></i></a>
                </li>
                <li class="breadcrumb-item">Category Form</li>
            </ol>
        </div>
        <div class="page-content fade-in-up">
            <div class="row">
                <div class="col-md-6">
                    <div class="ibox">
                        <div class="ibox-head">
                            <div class="ibox-title">Create form</div>
                            <div class="ibox-tools">
                                <a class="ibox-collapse"><i class="fa fa-minus"></i></a>
                                <a class="dropdown-toggle" data-toggle="dropdown" aria-expanded="false"><i class="fa fa-ellipsis-v"></i></a>
                                <div class="dropdown-menu dropdown-menu-right" x-placement="bottom-end" style="position: absolute; transform: translate3d(41px, 20px, 0px); top: 0px; left: 0px; will-change: transform;">
                                    <a class="dropdown-item">option 1</a>
                                    <a class="dropdown-item">option 2</a>
                                </div>
                            </div>
                        </div>
                        <div class="ibox-body" style="">
                            <form action="<%= action %>" method="post">
                                <input type="hidden" name="id" value="<%= product.getId() %>" />
                                <div class="form-row">
                                    <div class="col-md-12 mb-3">
                                        <label for="name">Product</label>
                                        <input type="text" class="form-control " id="name"
                                               placeholder="Product" name="name" value="<%= product.getName() %>">
                                    </div>
                                    <div class="col-md-12 mb-3">
                                        <label>Thumbnail</label>
                                        <div> <button type="button" class="btn btn-primary">Choose Image</button></div>
                                    </div>
                                    <div class="col-md-12 mb-3">
                                        <label for="price">Price</label>
                                        <input type="number" class="form-control " id="price"
                                               placeholder="Price" name="price" value="<%= product.getPrice() %>">
                                    </div>
                                    <div class="col-md-12 mb-3">
                                        <label for="categoryId">categoryId</label>
                                        <select class="form-control " name="categoryId" id="categoryId">
                                            <option value="">Select category</option>
                                            <% for (Category item : categoryList) { %>
                                            <option value="<%= item.getId() %>" <% if (product.getCategoryId() == item.getId()) { %>
                                                    selected <% } %> >
                                                <%= item.getName() %>
                                            </option>
                                            <% } %>
                                        </select>
                                    </div>
                                    <div class="col-md-12 mb-3">
                                        <label for="name">Status</label>
                                        <select name="status" class="form-control select2 select2-danger">
                                            <% for (int i =0; i< ProductStatus.values().length; i++){%>
                                            <option value=""<%= ProductStatus.values()[i].getValue()%><%= ProductStatus.values()[i].name()%>></option>
                                            <%}%>
                                        </select>
                                    </div>
                                </div>
                                <div class="form-row">
                                    <div class="col-md-12 mb-3">
                                        <label for="description">Description</label>
                                        <textarea  class="form-control " id="description"
                                                   placeholder="Description" name="description">
                                            <%= product.getDescription() %></textarea>
                                    </div>
                                    <div class="col-md-12 mb-3">
                                        <label for="detail">Detail</label>
                                        <div class="ibox-body">
                                            <div id="summernote" data-plugin="summernote" data-air-mode="true">
                                            </div>
                                        <textarea  class="form-control " id="detail"
                                                   placeholder="Detail" name="detail">
                                            <%= product.getDetail() %></textarea></div>
                                    </div>
                                </div>

                                <button class="btn btn-primary" type="submit">Submit</button>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
            <!-- END THEME CONFIG PANEL-->
            <!-- BEGIN PAGA BACKDROPS-->
            <div class="sidenav-backdrop backdrop"></div>
            <div class="preloader-backdrop" style="display: none;">
                <div class="page-preloader">Loading</div>
            </div>
            <!-- END PAGA BACKDROPS-->
            <!-- CORE PLUGINS-->
            <jsp:include page="/admin/includes/script.jsp"/>
            <script src="admin/dist/assets/vendors/summernote/dist/summernote.min.js" type="text/javascript"></script>

            <script type="text/javascript">
                $(function() {
                    $('#summernote').summernote();
                    $('#summernote_air').summernote({
                        airMode: true
                    });
                });
            </script>
            <!-- PAGE LEVEL SCRIPTS-->
</body></html>