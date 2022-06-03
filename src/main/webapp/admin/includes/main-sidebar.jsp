<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!-- START SIDEBAR-->
<nav class="page-sidebar" id="sidebar">
    <div id="sidebar-collapse">
        <div class="admin-block d-flex">
            <div>
                <img src="admin/dist/assets/img/admin-avatar.png" width="45px">
            </div>
            <div class="admin-info">
                <div class="font-strong">Admin</div><small>Administrator</small></div>
        </div>
        <ul class="side-menu metismenu">
            <li>
                <a href="index.html"><i class="sidebar-item-icon fa fa-th-large"></i>
                    <span class="nav-label">Dashboard</span>
                </a>
            </li>
            <li class="heading">FEATURES</li>

            <li class="active">
                <a href="javascript:;"><i class="sidebar-item-icon fa fa-edit"></i>
                    <span class="nav-label">Forms</span><i class="fa fa-angle-left arrow"></i></a>
                <ul class="nav-2-level collapse in" aria-expanded="true">
                    <li>
                        <a class="active" href="form_basic.html">Basic Forms</a>
                    </li>
                    <li>
                        <a href="form_advanced.html">Advanced Plugins</a>
                    </li>
                    <li>
                        <a href="form_masks.html">Form input masks</a>
                    </li>
                    <li>
                        <a href="form_validation.html">Form Validation</a>
                    </li>
                    <li>
                        <a href="text_editors.html">Text Editors</a>
                    </li>
                </ul>
            </li>
            <li>
                <a href="javascript:;"><i class="sidebar-item-icon fa fa-table"></i>
                    <span class="nav-label">Tables</span><i class="fa fa-angle-left arrow"></i></a>
                <ul class="nav-2-level collapse" aria-expanded="false">
                    <li>
                        <a href="table_basic.html">Basic Tables</a>
                    </li>
                    <li>
                        <a href="datatables.html">Datatables</a>
                    </li>
                </ul>
            </li>
            <li class="heading">PAGES</li>
            <li>
                <a href="javascript:;"><i class="sidebar-item-icon fa fa-envelope"></i>
                    <span class="nav-label">Category</span><i class="fa fa-angle-left arrow"></i></a>
                <ul class="nav-2-level collapse" aria-expanded="false">
                    <li>
                        <a href="admin/categories/create">Create</a>
                    </li>
                    <li>
                        <a href="admin/categories/list">List</a>
                    </li>
                </ul>
            </li>
            <li>
                <a href="javascript:;"><i class="sidebar-item-icon fa fa-envelope"></i>
                    <span class="nav-label">Products</span><i class="fa fa-angle-left arrow"></i></a>
                <ul class="nav-2-level collapse" aria-expanded="false">
                    <li>
                        <a href="/admin/products/create">Create</a>
                    </li>
                    <li>
                        <a href="admin/products/list">List</a>
                    </li>
                </ul>
            </li>
        </ul>
    </div>
</nav>
<!-- END SIDEBAR-->