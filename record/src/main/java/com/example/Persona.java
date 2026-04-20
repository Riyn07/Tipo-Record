package com.example;

import lombok.Builder;

@Builder
public record Persona(String nombre, int edad) {}
