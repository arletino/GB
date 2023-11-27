package Java.OOP.MVC.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import Java.OOP.MVC.model.Student;
import Java.OOP.MVC.model.StudyGroup;
import Java.OOP.MVC.model.Teacher;
import Java.OOP.MVC.model.User;

public class GroupService {
    private List<StudyGroup> groupList = new ArrayList<>();

    public void createGroup(User teacher, List<User> studentList) {
        StudyGroup studyGroup = new StudyGroup(groupList.isEmpty() ? 0 : groupList.size(),
                (Integer) ((Teacher) teacher).getTeacherId(), getStudentListId(studentList));
        groupList.add(studyGroup);
        System.out.println("Группа добавлена");

    }

    public Integer[] getStudentListId(List<User> studentList) {
        Integer[] studentListId = new Integer[studentList.size()];
        for (int i = 0; i < studentListId.length; i++) {
            studentListId[i] = ((Student) studentList.get(i)).getStudentId();
        }
        return studentListId;
    }
    public int[] getGroupList(){
        int[] groupList = new int[this.groupList.size()];
        for (int i = 0; i < groupList.length; i++) {
            groupList[i] = i; 
        }
        return groupList;
    }
    public List<User> getGroup(List<User> users, Integer id) {
        List<User> group = new ArrayList<>();
        StudyGroup studyGroup = groupList.get(id);
        for (User user : users) {
            if (user instanceof Student) {
                if (Arrays.asList(studyGroup.getStudentListId()).contains(((Student) user).getStudentId()))
                    group.add(user);
            }
            if (user instanceof Teacher) {
                if (studyGroup.getTeacherId() == (((Teacher) user).getTeacherId()))
                    group.add(user);
            }
        }
        return group;
    }

}
