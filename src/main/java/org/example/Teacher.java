package org.example;

import lombok.With;

public record Teacher(@With String id, @With String name, String subject) {
}
