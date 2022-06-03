package com.example.baitap4.constant;

public class SqlConstant {
    public static final String CATEGORY_INSERT = "insert into categories (name, createdAt, updatedAt, createdBy, updatedBy, status) values (?,?,?,?,?,?)";
    public static final String CATEGORY_UPDATE = "update categories set name = ?, updatedAt = ?, updatedBy = ?, status = ? where id = ?";
    public static final String CATEGORY_DELETE = "update categories set status = ? where id = ?";
    public static final String CATEGORY_FIELD_ID = "id";
    public static final String CATEGORY_FIELD_NAME = "name";
    public static final String CATEGORY_FIELD_STATUS = "status";
    public static final String FIELD_CREATED_AT = "createdAt";
    public static final String FIELD_UPDATED_AT = "updatedAt";
    public static final String FIELD_DELETED_AT = "deletedAt";
    public static final String FIELD_CREATED_BY = "createdBy";
    public static final String FIELD_UPDATED_BY = "updatedBy";
    public static final String FIELD_DELETED_BY = "deletedBy";
    public static final String PRODUCT_INSERT = "insert into products (name, description, detail, price, thumbnail, categoryId," +
            "createdAt, updatedAt, deletedAt, createdBy, updatedBy, deletedBy, status) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
    public static final String PRODUCT_UPDATE = "update products set name = ?, description = ?, detail = ?, price = ?, thumbnail = ?, categoryId = ?," +
            "createdAt = ?, updatedAt = ?, deletedAt = ?, createdBy = ?, updatedBy = ?, deletedBy = ?, status = ? WHERE id = ?;";
    public static final String PRODUCT_DELETE = "delete from products where id = ?;";
    public static final String PRODUCT_UPDATE_STATUS = "update products SET status = ? where id = ?";
    public static final String PRODUCT_FIND_BY_ID = "select * from products where id = ? and status = ?;";
    public static final String PRODUCT_FIND_ALL = "select * from products where status = ? oder by createdAt desc;";
    public static final String PRODUCT_FIELD_ID = "id";
    public static final String PRODUCT_FIELD_NAME = "name";
    public static final String PRODUCT_FIELD_DESCRIPTION = "description";
    public static final String PRODUCT_FIELD_DETAIL = "detail";
    public static final String PRODUCT_FIELD_PRICE = "price";
    public static final String PRODUCT_FIELD_THUMBNAIL = "thumbnail";
    public static final String PRODUCT_FIELD_STATUS = "status";
    public static final String PRODUCT_FIELD_CATEGORY_ID = "categoryId";

    public static final String CATEGORY_FIND_BY_ID = "select * from categories where status = ? and id = ?";
    public static final String CATEGORY_FIND_ALL = "select * from categories where status = ? and id = ?";
}
