/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author admin
 */
public class Ciudad {
    private long id;
    private String name;
    private String countrycode;
    private String district;
    private long population;

    public Ciudad(){
    
    }
    
    public long getId(){
        return id;
    }

    public void setId(long id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getCountryCode(){
        return countrycode;
    }

    public void setCountryCode(String countrycode){
        this.countrycode = countrycode;
    }

    public String getDistrict(){
       return district;
    }

    public void setDistrict(String district){
        this.district = district;
    }

    public long getPopulation(){
        return population;
    }

    public void setPopulation(long population){
        this.population = population;
    }

    @Override
    public String toString(){
        return "Ciudad [id= " + id + " name= " + name + " countrycode= " + countrycode + " district= " + district + " population= " + population; 
    }

}
