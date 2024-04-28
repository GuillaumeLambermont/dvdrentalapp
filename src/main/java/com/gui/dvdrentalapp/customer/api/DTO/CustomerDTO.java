package com.gui.dvdrentalapp.customer.api.DTO;

import java.time.LocalDate;
import java.time.LocalDateTime;

public record CustomerDTO(
        long customerId,
        long store_id,
        String firstName,
        String lastName,
        String email,
        long addressId,
        boolean activebool,
        LocalDate createDate,
        LocalDateTime lastUpdate,
        int active
) {
}
