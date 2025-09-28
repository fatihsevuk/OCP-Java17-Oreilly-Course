package com.fatihsevuk.java17.lesson12_Inheritance.selaed;

sealed interface BaseIF permits SubEnum , SubRecord {}

enum SubEnum implements BaseIF {
    ONE, TWO {
        @Override
        public String toString() {
            return super.toString() + " A " +
                    "SubEnum";
        }
    };
}

record  SubRecord() implements BaseIF {}

public class RecordsAndEnums {

}
