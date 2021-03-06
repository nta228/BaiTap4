package com.example.baitap4.entity;

import com.example.baitap4.entity.base.BaseEntity;
import com.example.baitap4.entity.myenum.CategoryStatus;

import java.time.LocalDateTime;
import java.util.HashMap;

public class Category extends BaseEntity {
    private int id;
    private String name;
    private CategoryStatus status;
    private HashMap<String, String> errors;

    public Category() {
        this.name = "";
        this.status = CategoryStatus.UNDEFINED;
        errors = new HashMap<>();
    }

    public Category(int id, String name, CategoryStatus status) {
        this.id = id;
        this.name = name;
        this.status = status;
    }

    public Category(int id, String name, LocalDateTime createdAt, LocalDateTime updatedAt, LocalDateTime deletedAt, int createdBy, int updatedBy, int deletedBy,CategoryStatus status) {
        super(createdAt, updatedAt, deletedAt, createdBy, updatedBy, deletedBy);
        this.id = id;
        this.name = name;
        this.status = status;
    }

    public Category(String name, CategoryStatus status) {
        this.name = name;
        this.status = status;
        errors = new HashMap<>();
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

    public CategoryStatus getStatus() {
        return status;
    }

    public void setStatus(CategoryStatus status) {
        this.status = status;
    }

    public HashMap<String, String> getErrors() {
        return errors;
    }

    public void setErrors(HashMap<String, String> errors) {
        this.errors = errors;
    }

    public static final class CategoryBuilder {
        public int id;
        public String name;
        public CategoryStatus status;
        public LocalDateTime createdAt;
        public LocalDateTime updatedAt;
        public LocalDateTime deletedAt;
        public int createdBy;
        public int updatedBy;
        public int deletedBy;

        private CategoryBuilder() {
            this.name = "";
            this.createdAt = LocalDateTime.now();
            this.updatedAt = LocalDateTime.now();
            this.status = CategoryStatus.ACTIVE;
        }

        public static CategoryBuilder aCategory() {
            return new CategoryBuilder();
        }

        public CategoryBuilder withId(int id) {
            this.id = id;
            return this;
        }

        public CategoryBuilder withName(String name) {
            this.name = name;
            return this;
        }
        public CategoryBuilder withStatus(CategoryStatus status) {
            this.status = status;
            return this;
        }

        public CategoryBuilder withCreatedAt(LocalDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public CategoryBuilder withUpdatedAt(LocalDateTime updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        public CategoryBuilder withDeletedAt(LocalDateTime deletedAt) {
            this.deletedAt = deletedAt;
            return this;
        }

        public CategoryBuilder withCreatedBy(int createdBy) {
            this.createdBy = createdBy;
            return this;
        }

        public CategoryBuilder withUpdatedBy(int updatedBy) {
            this.updatedBy = updatedBy;
            return this;
        }

        public CategoryBuilder withDeletedBy(int deletedBy) {
            this.deletedBy = deletedBy;
            return this;
        }

        public Category build() {
            Category category = new Category();
            category.setId(id);
            category.setName(name);
            category.setStatus(status);
            category.setCreatedAt(createdAt);
            category.setUpdatedAt(updatedAt);
            category.setDeletedAt(deletedAt);
            category.setCreatedBy(createdBy);
            category.setUpdatedBy(updatedBy);
            category.setDeletedBy(deletedBy);
            return category;
        }

        public Category build2() {
            Category category = new Category();
            category.setName(name);
            category.setStatus(status);
            return category;
        }
    }

    public boolean isValid() {
        this.checkValid();
        return this.errors.size() == 0;
    }

    public void checkValid() {

    }
}