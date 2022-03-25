/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package handlingexceptions_aap.entities;

/**
 *
 * @author Ivan
 */
public class WineLabel_2learnExceptions {
    
    private String wineLabelWinery;
    private String wineLabelName;
    private Integer wineLabelVintage;
    private Double wineLabelAlcohol;

    public WineLabel_2learnExceptions() {
    }

    public WineLabel_2learnExceptions(String wineLabelWinery, String wineLabelName, Integer wineLabelVintage, Double wineLabelAlcohol) {
        this.wineLabelWinery = wineLabelWinery;
        this.wineLabelName = wineLabelName;
        this.wineLabelVintage = wineLabelVintage;
        this.wineLabelAlcohol = wineLabelAlcohol;
    }

    public String getWineLabelWinery() {
        return wineLabelWinery;
    }

    public void setWineLabelWinery(String wineLabelWinery) {
        this.wineLabelWinery = wineLabelWinery;
    }

    public String getWineLabelName() {
        return wineLabelName;
    }

    public void setWineLabelName(String wineLabelName) {
        this.wineLabelName = wineLabelName;
    }

    public Integer getWineLabelVintage() {
        return wineLabelVintage;
    }

    public void setWineLabelVintage(Integer wineLabelVintage) {
        this.wineLabelVintage = wineLabelVintage;
    }

    public Double getWineLabelAlcohol() {
        return wineLabelAlcohol;
    }

    public void setWineLabelAlcohol(Double wineLabelAlcohol) {
        this.wineLabelAlcohol = wineLabelAlcohol;
    }

    @Override
    public String toString() {
        return "WineLabel_2learnExceptions{" + "wineLabelWinery=" + wineLabelWinery + ", wineLabelName=" + wineLabelName + ", wineLabelVintage=" + wineLabelVintage + ", wineLabelAlcohol=" + wineLabelAlcohol + '}';
    }
    
    
    
}
