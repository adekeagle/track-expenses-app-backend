package pl.byczazagroda.trackexpensesappbackend.exception;

import lombok.Getter;
import lombok.Setter;

/**
 * ApiException create business exception message response
 * for cases beyond validation
 */
@Getter
@Setter
public class ApiException {

    private String status; // "W001",
    private String message; //  "WALLETS_RETRIEVING_ERROR",
    private String description; // "Wallet with id: is not found in the database",
    private Integer statusCode; // 404,

    public ApiException(String status, String message,
                        String description,
                        Integer statusCode) {
        this.status = status;
        this.message = message;
        this.description = description;
        this.statusCode = statusCode;
    }
}