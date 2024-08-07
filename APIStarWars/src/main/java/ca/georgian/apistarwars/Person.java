package ca.georgian.apistarwars;

public class Person {
    private String name;
    private String height;
    private String hair_color;
    private String skin_color;
    private String eye_color;
    private String gender;

    private Person(){

    }
    private Person( String name, String height, String hair_color, String skin_color, String eye_color, String gender){
       this.name = name;
       this.height = height;
       this.hair_color = hair_color;
       this.skin_color = skin_color;
       this.eye_color = eye_color;
       this.gender = gender;
    }

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getHeight(){
        return this.height;
    }
    public void setHeight(String height){
        this.height = height;
    }
}
