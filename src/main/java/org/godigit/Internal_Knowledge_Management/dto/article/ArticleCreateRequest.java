package org.godigit.Internal_Knowledge_Management.dto.article;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.util.Set;

public record ArticleCreateRequest(
  @NotBlank String title,
  @NotBlank String body,
  @NotNull Long departmentId,
  Set<String> tags
) {}
