package ChickenFarm.model;

public class ChickenBuyer extends ChickenStore{
    int yuan = 100;
    int maxChicken = 100;

    @Override
    public int getMaxCock() {
        return yuan/this.getCockCost();
    }

    @Override
    public int getMaxHen() {
        return yuan/this.getHenCost();
    }

    @Override
    public int getMaxChicken() {
        return yuan/this.getChickenCost();
    }

    public double getTotalCost(int cock,int hen,int chicken) {
        return (cock * getCockCost()) + (hen * getHenCost()) + (chicken * (getChickenCost()/3.0));
    }

    public int getTotalChickens(int cock,int hen,int chicken) {
        return cock + hen + chicken;
    }

    public void getChickens() {
        for(int cock = 1; cock <= getMaxCock(); cock++){
            for(int hen = 1; hen <= getMaxHen(); hen++){
                for(int chickens = 1; chickens <= maxChicken; chickens++) {
                    if(getTotalCost(cock, hen, chickens) == yuan && (getTotalChickens(cock, hen, chickens) == maxChicken)) {
                        System.out.print("You can buy " + cock + " cocks, ");
                        System.out.print(hen + " hens, and ");
                        System.out.print(chickens + " chickens");
                        System.out.println();
                        break;
                    }
                }
            }
        }
    }
}
