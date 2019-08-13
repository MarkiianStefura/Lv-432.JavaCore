package com.company;

import java.io.BufferedReader;
import java.io.IOException;

public class Task3 {

    public static void httpErrors(BufferedReader bufferedReader) throws IOException {

        System.out.println("Enter your error number");
        int error1 = Integer.parseInt(bufferedReader.readLine());

        HTTPError httpError;

        switch (error1) {
            case 400:
                httpError = HTTPError.BAD_REQUEST;
                break;
            case 401:
                httpError = HTTPError.UNAUTHORIZED;
                break;
            case 402:
                httpError = HTTPError.PAYMENT_REQUIRED;
                break;
                default:
                    httpError = HTTPError.I_DONT_NOW;
        }

        System.out.println(httpError);
    }

}
