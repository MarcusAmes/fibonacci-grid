package com.galvanize;

class ArgsChecker {

    void check(String[] args) throws IllegalArgumentException {
        if (args.length < 2) {
            throw new IllegalArgumentException("too few arguments");
        } else if (args.length > 2) {
            throw new IllegalArgumentException("too many arguments");
        }

        for (String input : args) {
            try {
                Integer.parseInt( input );
            }
            catch( NumberFormatException e ) {
                throw new IllegalArgumentException("non-numeric arguments");
            }
            if (Integer.parseInt(input) == 0) {
                throw new IllegalArgumentException("zeros");
            } else if (Integer.parseInt(input) < 0) {
                throw new IllegalArgumentException("negative numbers");
            }
        }

    }
}
