package com.example.entity5;

import java.io.Serializable;
import java.sql.*;
import java.time.*;
import javax.persistence.*;
import lombok.Data;
import lombok.ToString;

/**
 * Note: auto-generated by jpa-entity-generator
 */
@Data
@ToString
@Entity(name = "com.example.entity5.Tag")
@Table(name = "tag")
public class Tag implements Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "\"id\"", nullable = false)
  private Integer id;
  @Column(name = "\"tag\"", nullable = true)
  private String tag;
  @Column(name = "\"created_at\"", nullable = false)
  private LocalDateTime createdAt;
}