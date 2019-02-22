package com.cfd.board.sub.server.Mapper;

import com.cfd.board.sub.server.entitiy.ServerGroup;

public interface ServerGroupMapper {
    /**
     *
     * @Title: deleteByPrimaryKey
     * @Description: deleteByPrimaryKey
     * @param: groupId
     * @return: int
     * @author ChenWeiYu
     * @date 2019年02月22日 23:27
     * @version v1.0 
     */
    int deleteByPrimaryKey(Integer groupId);

    /**
     *
     * @Title: insert
     * @Description: insert
     * @param: record
     * @return: int
     * @author ChenWeiYu
     * @date 2019年02月22日 23:27
     * @version v1.0 
     */
    int insert(ServerGroup record);

    /**
     *
     * @Title: insertSelective
     * @Description: insertSelective
     * @param: record
     * @return: int
     * @author ChenWeiYu
     * @date 2019年02月22日 23:27
     * @version v1.0 
     */
    int insertSelective(ServerGroup record);

    /**
     *
     * @Title: selectByPrimaryKey
     * @Description: selectByPrimaryKey
     * @param: groupId
     * @return: com.cfd.board.sub.server.entitiy.ServerGroup
     * @author ChenWeiYu
     * @date 2019年02月22日 23:27
     * @version v1.0 
     */
    ServerGroup selectByPrimaryKey(Integer groupId);

    /**
     *
     * @Title: updateByPrimaryKeySelective
     * @Description: updateByPrimaryKeySelective
     * @param: record
     * @return: int
     * @author ChenWeiYu
     * @date 2019年02月22日 23:27
     * @version v1.0 
     */
    int updateByPrimaryKeySelective(ServerGroup record);

    /**
     *
     * @Title: updateByPrimaryKey
     * @Description: updateByPrimaryKey
     * @param: record
     * @return: int
     * @author ChenWeiYu
     * @date 2019年02月22日 23:27
     * @version v1.0 
     */
    int updateByPrimaryKey(ServerGroup record);
}