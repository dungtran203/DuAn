<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<html>
<head>
    <title>Product</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
</head>
<body>
<header><h2 style="text-align: center;">Products</h2></header>
<main>
    <section class="container">
        <a class="btn btn-dark" href="/admin/product/view-add">Thêm</a>
        <a class="btn btn-dark" href="/home/view">Quay về trang chủ</a>
    </section>
    <section>
        <div class="container">
            <table class="table">
                <thead>
                <tr>
                    <th scope="col">ID</th>
                    <th scope="col">Name</th>
                    <th scope="col">Image</th>
                    <th scope="col">Price</th>
                    <th scope="col">CreateDate</th>
                    <th scope="col">Available</th>
                    <th scope="col">Action</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach items="${listProduct.getContent()}" var="p">
                    <tr>
                        <td>${p.id}</td>
                        <td>${p.name}</td>
                        <td>${p.image}</td>
                        <td>${p.price }</td>
                        <td>${p.createDate}</td>
                        <td>${p.available ? "Còn hàng" : "Hết hàng"}</td>
                        <td>
                            <a class="btn btn-dark" href="/admin/product/detail${p.id}" >Chi tiết</a>
                            <a class="btn btn-dark" href="/admin/product/view-update/${p.id}">Sửa</a>
                            <a class="btn btn-dark" href="/admin/product/delete/${p.id}">Xóa</a>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>

            <c:if test="${listProduct.getNumber() gt 0}">
                <a href="?page=${listProduct.getNumber()}">
                    Previous
                </a>
            </c:if>

            <span>${listProduct.getNumber() + 1} / ${listProduct.getTotalPages()}</span>

            <c:if test="${listProduct.getNumber() lt listProduct.getTotalPages() - 1}">
                <a href="?page=${listProduct.getNumber() + 2}">
                    Next
                </a>
            </c:if>
        </div>
    </section>
</main>
<footer><p style="text-align: center;">Dungttmph25136</p></footer>
</body>
</html>
