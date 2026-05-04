package proj2;
//*
// Denna klass fungerar som en ursprungsklass för alla "mediaklasser" */
public class MediaTemplate extends Template{
    public String type;
public MediaTemplate(String id, String type, boolean isAvailible){
    super(id, isAvailible);
    this.type = type;

}
}
