package com.example.baitap4.entity;
import com.example.baitap4.entity.base.BaseEntity;
import com.example.baitap4.entity.myenum.ProductStatus;

import java.time.LocalDateTime;
import java.util.HashMap;

public class Product extends BaseEntity {
    private int id;
    private String name;
    private String description;
    private String detail;
    private double price;
    private String thumbnail;
    private int categoryId;
    private ProductStatus status;
    private HashMap<String, String> errors;

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", detail='" + detail + '\'' +
                ", price=" + price +
                ", thumbnail='" + thumbnail + '\'' +
                ", categoryId=" + categoryId +
                ", status=" + status +
                ", errors=" + errors +
                '}';
    }

    public Product() {
        this.name = "";
        this.description = "";
        this.detail = "";
        this.thumbnail = "";
        this.status = ProductStatus.ACTIVE;
        errors = new HashMap<>();
    }

    public Product(int id, String name, String description, String detail, double price, String thumbnail, int categoryId, ProductStatus status, HashMap<String, String> errors) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.detail = detail;
        this.price = price;
        this.thumbnail = thumbnail;
        this.categoryId = categoryId;
        this.status = status;
        this.errors = errors;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public ProductStatus getStatus() {
        return status;
    }

    public void setStatus(ProductStatus status) {
        this.status = status;
    }

    public HashMap<String, String> getErrors() {
        return errors;
    }

    public void setErrors(HashMap<String, String> errors) {
        this.errors = errors;
    }
    public static final class ProductBuilder {
        private LocalDateTime createdAt;
        private LocalDateTime updatedAt;
        private LocalDateTime deletedAt;
        private int createdBy;
        private int updatedBy;
        private int deletedBy;
        private int id;
        private String name;
        private String description;
        private String detail;
        private double price;
        private String thumbnail;
        private int categoryId;
        private ProductStatus status;

        private ProductBuilder() {
        }

        public static ProductBuilder aProduct() {
            return new ProductBuilder();
        }

        public ProductBuilder withId(int id) {
            this.id = id;
            return this;
        }

        public ProductBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public ProductBuilder withDescription(String description) {
            this.description = description;
            return this;
        }

        public ProductBuilder withDetail(String detail) {
            this.detail = detail;
            return this;
        }

        public ProductBuilder withPrice(double price) {
            this.price = price;
            return this;
        }

        public ProductBuilder withThumbnail(String thumbnail) {
            this.thumbnail = thumbnail;
            return this;
        }

        public ProductBuilder withCategoryId(int categoryId) {
            this.categoryId = categoryId;
            return this;
        }

        public ProductBuilder withStatus(ProductStatus status) {
            this.status = status;
            return this;
        }

        public ProductBuilder withCreatedAt(LocalDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public ProductBuilder withUpdatedAt(LocalDateTime updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        public ProductBuilder withDeletedAt(LocalDateTime deletedAt) {
            this.deletedAt = deletedAt;
            return this;
        }

        public ProductBuilder withCreatedBy(int createdBy) {
            this.createdBy = createdBy;
            return this;
        }

        public ProductBuilder withUpdatedBy(int updatedBy) {
            this.updatedBy = updatedBy;
            return this;
        }

        public ProductBuilder withDeletedBy(int deletedBy) {
            this.deletedBy = deletedBy;
            return this;
        }

        public Product build() {
            Product product = new Product();
            product.setId(id);
            product.setName(name);
            product.setDescription(description);
            product.setDetail(detail);
            product.setPrice(price);
            product.setThumbnail(thumbnail);
            product.setCategoryId(categoryId);
            product.setStatus(status);
            product.setCreatedAt(createdAt);
            product.setUpdatedAt(updatedAt);
            product.setDeletedAt(deletedAt);
            product.setCreatedBy(createdBy);
            product.setUpdatedBy(updatedBy);
            product.setDeletedBy(deletedBy);
            return product;
        }

        public Product build2() {
            Product product = new Product();
            product.setId(id);
            product.setName(name);
            product.setDescription(description);
            product.setDetail(detail);
            product.setPrice(price);
            product.setThumbnail(thumbnail);
            product.setCategoryId(categoryId);
            product.setStatus(status);
            return product;
        }
    }

    public boolean isValid() {
        this.checkValid();
        return this.errors.size() == 0;
    }

    public void checkValid() {
        }
}