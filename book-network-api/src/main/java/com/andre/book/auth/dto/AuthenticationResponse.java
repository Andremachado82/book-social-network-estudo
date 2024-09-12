package com.andre.book.auth.dto;

import lombok.Builder;

@Builder
public record AuthenticationResponse(

        String token
) {
}
