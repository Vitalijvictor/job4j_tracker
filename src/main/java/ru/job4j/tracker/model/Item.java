package ru.job4j.tracker.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Objects;

public class Item {

    private static final DateTimeFormatter FORMATTER = DateTimeFormatter
            .ofPattern("dd-MM-yyyy HH:mm:ss");

    private int id;

    private String name;

    private LocalDateTime created = LocalDateTime.now()
            .truncatedTo(ChronoUnit.MICROS);

    public Item() {
    }

    public Item(int id) {
        this.id = id;
    }

    public Item(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Item(int id, LocalDateTime created) {
        this.id = id;
        this.created = created;
    }

    public Item(String name, LocalDateTime created) {
        this.name = name;
        this.created = created;
    }

    public Item(int id, String name, LocalDateTime created) {
        this.id = id;
        this.name = name;
        this.created = created;
    }

    public Item(String name) {
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

    public LocalDateTime getCreated() {
        return created;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Item item = (Item) o;
        return id == item.id && Objects.equals(name, item.name)
                && Objects.equals(created, item.created);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, created);
    }

    @Override
    public String toString() {
        return String
                .format("id: %s, name: %s, created: %s", id, name, FORMATTER.format(created));
    }
}