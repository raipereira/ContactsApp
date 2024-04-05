package edu.miu.cs489.quiz.model;

public class Phone {

        private String number;
        private String label;

        public Phone(String number, String label) {
            this.number = number;
            this.label = label;
        }

        public String getNumber() {
            return number;
        }

        public String getLabel() {
            return label;
        }
    }

