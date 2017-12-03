package com.example.franciscoandrade.fragmentspractice;



public class CheckingInput {


    private String editTextString;



    public CheckingInput(String editTextString) {
        this.editTextString = editTextString;

        switchCheck(editTextString);
    }

    private void switchCheck(String editTextString) {
        switch (editTextString) {

            case "One":
                setEditTextString("You typed ONE");
                break;

            case "Two":
                setEditTextString("You typed TWO");
                break;

            case "Three":
                setEditTextString("You typed Three");
                break;
            default:
                    setEditTextString("Not the right world");
                    break;

        }
    }


    public String getEditTextString() {
        return editTextString;
    }


    public void setEditTextString(String editTextString) {
        this.editTextString = editTextString;
    }
}
