package com.faletyonok.teleport.entity;

import jakarta.persistence.*;
import lombok.*;

/**
 * @author Alexander Victorovich Faletyonok
 * @version 1.0
 * <p>
 *     Test web application "Java Teleport Travel Company"
 * </p>
 * https://github.com/AVFaletyonok/JavaTeleportTravelCompanySite
 */
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "clients")
public class ClientProfile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "phone")
    private long phone;

    @Column(name = "email")
    private String email;

    public ClientProfile(String name, long phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public String getName() { return name; }

    public long getPhone() { return phone; }

    public String getEmail() { return email; }

    @Override
    public String toString() {
        return "ClientProfile{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone=" + phone +
                ", email='" + email + '\'' +
                '}';
    }
}
