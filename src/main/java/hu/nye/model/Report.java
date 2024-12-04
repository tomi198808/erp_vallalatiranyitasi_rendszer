package hu.nye.model;

import jakarta.persistence.*;
import java.time.LocalDate;

/**
 * Represents a report entity in the application.
 * This entity stores information about a report, including its name and date.
 */
@Entity
public class Report {

    /**
     * Unique identifier for the report, generated automatically.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * The name of the report.
     */
    private String name;

    /**
     * The date associated with the report.
     */
    private LocalDate date;

    /**
     * Default constructor for the Report class.
     */
    public Report() {
    }

    /**
     * Constructs a Report with a specified name and date.
     *
     * @param name the name of the report.
     * @param date the date associated with the report.
     */
    public Report(String name, LocalDate date) {
        this.name = name;
        this.date = date;
    }

    // Getters and Setters

    /**
     * Retrieves the unique ID of the report.
     *
     * @return the ID of the report.
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets the unique ID of the report.
     *
     * @param id the new ID for the report.
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Retrieves the name of the report.
     *
     * @return the name of the report.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the report.
     *
     * @param name the new name for the report.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Retrieves the date associated with the report.
     *
     * @return the date of the report.
     */
    public LocalDate getDate() {
        return date;
    }

    /**
     * Sets the date associated with the report.
     *
     * @param date the new date for the report.
     */
    public void setDate(LocalDate date) {
        this.date = date;
    }

    /**
     * Returns a string representation of the Report.
     *
     * @return a string with report details.
     */
    @Override
    public String toString() {
        return "Report{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", date=" + date +
                '}';
    }
}
