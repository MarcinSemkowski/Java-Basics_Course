package Inner_And_Abstract_Classes_and_Interfaces.L_2;


import java.util.List;

public interface ISaveable{
  List<String> write();
  void read(List<String> savedValues);

}
