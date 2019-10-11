package mappers;

import mappersain.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserDao {
    //查询所有
    @Select("select * from tb_user where user_name = 'zpc'")
    List<User> findAll();
}
