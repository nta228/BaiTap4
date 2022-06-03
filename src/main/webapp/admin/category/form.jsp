<%@ page import="com.example.baitap4.entity.myenum.FormAction" %>
<%@ page import="java.util.HashMap" %>
<%@ page import="com.example.baitap4.entity.Category" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en" dir="ltr">
<jsp:include page="/admin/includes/head.jsp">
    <jsp:param name="title" value="Category - Create"/>
</jsp:include>
<%
    FormAction formAction = (FormAction) request.getAttribute("formAction");
    String action = "/admin/categories/create";
    if (formAction == FormAction.UPDATE) {
        action = "/admin/categories/update";
    }
    HashMap<String, String> errors = (HashMap<String, String>) request.getAttribute("errors");
    if (errors == null) {
        errors = new HashMap<>();
    }
    List<Category> categoryList = (List<Category>) request.getAttribute("categoryList");
    if (categoryList == null) {
        categoryList = new ArrayList<>();
    }
    Category category = (Category) request.getAttribute("category");
    if (category == null) {
        category = new Category();
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
                                <input type="hidden" name="id" value="<%= category.getId() %>" />
                                <div class="form-row">
                                    <div class="col-md-12 mb-3">
                                        <label for="name">Category Name</label>
                                        <input type="text" class="form-control " id="name"
                                               placeholder="First name" name="name" value="<%= category.getName() %>">
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
            <!-- PAGE LEVEL SCRIPTS-->
</body></html>