
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return birdsPerDay;
    }

    public int getToday() {
        return birdsPerDay[6];
    }

    public void incrementTodaysCount() {
        int element = birdsPerDay[6];
        element ++;
        birdsPerDay[6] = element;
        return;
    }

    public boolean hasDayWithoutBirds() {
        boolean cero_per = false;
        for(int i = 0; i < 7; i++){
            if (birdsPerDay[i] == 0){
                cero_per = true;
            }
        }
        return cero_per;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int cont = 0;
        for(int i = 0; i < numberOfDays && i < 7; i++){
                cont = cont + birdsPerDay[i]; 
        }
        return cont;
    }

    public int getBusyDays() {
        int cont = 0;
        for(int i = 0; i < 6; i++){
            if (birdsPerDay[i] >= 5){
                cont ++;
            }
        }
        return cont;
    }
}
