package com.cfd.board.sub.server.Mapper;

import com.cfd.board.sub.server.entitiy.ServerInfo;

public interface ServerInfoMapper {
    /**
     *
     * @Title: deleteByPrimaryKey
     * @Description: deleteByPrimaryKey
     * @param: infoId
     * @return: int
     * @author ChenWeiYu
     * @date 2019年02月22日 23:27
     * @version v1.0 
     */
    int deleteByPrimaryKey(Integer infoId);

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
    int insert(ServerInfo record);

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
    int insertSelective(ServerInfo record);

    /**
     *
     * @Title: selectByPrimaryKey
     * @Description: selectByPrimaryKey
     * @param: infoId
     * @return: com.cfd.board.sub.server.entitiy.ServerInfo
     * @author ChenWeiYu
     * @date 2019年02月22日 23:27
     * @version v1.0 
     */
    ServerInfo selectByPrimaryKey(Integer infoId);

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
    int updateByPrimaryKeySelective(ServerInfo record);

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
    int updateByPrimaryKey(ServerInfo record);
}