package com.example.myapp.lambda;

public class Lambda_Example {
    //with lambda's
    public void main (String args[]){
        OnClickImp onclickobj = new OnClickImp();
        onclickobj.OnClick(123);
    }

    //with lambda
    //here we no need to create an implement class for the interface
    OnClickListner onClickListner = (v) -> {
        System.out.println("Handling lambda click");
    };

    onClickListner.onClick(123);
    }
}
