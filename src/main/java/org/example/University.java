package org.example;

import java.util.List;

public record University(String id, String name, List<Course> courses) {
}
