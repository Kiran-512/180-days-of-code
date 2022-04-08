class AkhriExceptionDemo{
    public static void main(String[] args) throws ClassNotFoundException{
        try {
            
        } catch (Exception e) {

        }
        // this line will give error as no error prone code is there in try related to ClassNotFoundException which is checked exception for which there is compulsion to have the error prone code in the try block 
        catch(ClassNotFoundException e){
        }
    }
}
/*
AkhriException.java:9: error: exception ClassNotFoundException has already been caught
        catch(ClassNotFoundException e){
        ^
1 error
*/