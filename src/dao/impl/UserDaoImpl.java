package dao.impl;

import com.alibaba.druid.pool.DruidDataSource;
import dao.UserDao;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.taglibs.standard.tag.common.sql.DataSourceUtil;
import pojo.User;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.List;


public class UserDaoImpl extends BaseDao implements UserDao {
    @Override
    public User queryUserByUsername(String username) {
        String sql = "select `id`,`username`,`password` from v_user where username = ?";
        return queryForOne(User.class, sql, username);
    }

    @Override
    public User queryUserByUsernameAndPassword(String username, String password) {
        String sql = "select `id`,`username`,`password` from v_user where username = ? and password = ?";
        return queryForOne(User.class, sql,username,password);
    }

    @Override
    public int saveUser(User user) {
        String sql = "insert into v_user(`username`,`password`) values(?,?)";
        return update(sql, user.getUsername(),user.getPassword());
    }

    @Override
    public List<User> findAll() {
        String sql = "select id,username,password from v_user";
        return queryForList(User.class,sql);
    }


}
