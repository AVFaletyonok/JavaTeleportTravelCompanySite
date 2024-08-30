package com.faletyonok.teleport.DTO;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

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
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ClientDTO {
    String name;
    long phone;
    String email;
}
