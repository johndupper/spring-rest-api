package com.teamtreehouse.giflib.data;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class Category {
    private static final List<Category> ALL_CATEGORIES = Arrays.asList(
            new Category(1, "Technology"),
            new Category(2, "People"),
            new Category(3, Destruction)
    );
}
