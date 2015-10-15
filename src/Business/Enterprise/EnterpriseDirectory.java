/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Enterprise;

import java.util.ArrayList;

/**
 *
 * @author nirav gupta
 */
public class EnterpriseDirectory {
    private ArrayList<Enterprise> enterpriseList;
    
    public EnterpriseDirectory(){
        enterpriseList = new ArrayList<>();
    }

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }
    
    public Enterprise createAndAddEnterprise(String name,Enterprise.EnterpriseType type){
        Enterprise enterprise = null;
        if(type == Enterprise.EnterpriseType.Hospital){
            
            enterprise = new HospitalEnterprise(name);
            enterpriseList.add(enterprise);
        } else if(type == Enterprise.EnterpriseType.Supplier){
            
            enterprise = new SupplierEnterprise(name);
            enterpriseList.add(enterprise);
        } else if(type == Enterprise.EnterpriseType.WareHouse){
            
            enterprise = new WarehouseEnterprise(name);
            enterpriseList.add(enterprise);
        }else if(type == Enterprise.EnterpriseType.PHSenterprise){
            
            enterprise = new PHSenterprise(name);
            enterpriseList.add(enterprise);
        }
        return enterprise;
    }
}