package org.godigit.Internal_Knowledge_Management.dto.article;

import jakarta.validation.constraints.NotBlank;

import java.util.Set;
public record ArticleUpdateRequest(@NotBlank String title, @NotBlank String body, Set<String> tags) {}
