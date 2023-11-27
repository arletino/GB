package Java.OOP.MVC.model;


public class StudyGroup {
    private Integer teacherId;
    private Integer[] studentListId;
    private Integer groupId;
    public StudyGroup(Integer groupId, Integer teacherId, Integer[] studentListId) {
        this.teacherId = teacherId;
        this.studentListId = studentListId;
        this.groupId = groupId;
    }
 
    @Override
    public String toString() {
        return "StudyGroup [teacher=" + teacherId + 
                ", studentList=" + studentListId + "]";
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public Integer[] getStudentListId() {
        return studentListId;
    }

    public void setStudentListId(Integer[] studentListId) {
        this.studentListId = studentListId;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }
    
    
}
