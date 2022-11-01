package com.ky.javaawt;

import java.awt.*;

public class MyForm extends Frame {
    private Label lblcourse,lblgender,lblta,lblchoice;
    private Checkbox cbbasic,cbweb,cbmale,cbfemale;
    private CheckboxGroup cg=new CheckboxGroup();
    private TextArea ta;
    private Choice country;
    private Button btn;

    public MyForm(){
        lblcourse=new Label("Course: ");
        lblgender=new Label("Gender: ");
        lblta=new Label("TextArea");
        lblchoice=new Label("Country:");

        cbbasic=new Checkbox("Basic");
        cbweb=new Checkbox("Web");

        cbmale=new Checkbox("Male",cg,false);
        cbfemale=new Checkbox("Female",cg,false);

        ta=new TextArea(5,20);

        country=new Choice();
        country.addItem("Nepal");
        country.addItem("China");
//button
        btn=new Button("Button");



        //course
        add(lblcourse);
        add(cbbasic);
        add(cbweb);

        //gender
        add(lblgender);
        add(cbmale);
        add(cbfemale);

        //textarea
        add(lblta);
        add(ta);

        //country
        add(lblchoice);
        add(country);

        add(btn);



        setLayout(new FlowLayout());
        setSize(200,300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MyForm();
    }
}
