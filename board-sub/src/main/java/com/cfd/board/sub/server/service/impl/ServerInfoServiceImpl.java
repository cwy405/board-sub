/**   
* @Title:  ServerInfoServiceImpl.java   
* @Package： com.cfd.board.sub.server.service.impl   
* @Description: TODO(用一句话描述该文件做什么)   
*
* @version: v1.0.0
* @author: Chen WeiYu
* @date: 2019年2月22日 下午11:11:06 
*/
package com.cfd.board.sub.server.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cfd.board.sub.server.Mapper.ServerInfoMapper;
import com.cfd.board.sub.server.entitiy.ServerInfo;
import com.cfd.board.sub.server.service.ServerInfoService;

/**   
* @Title:  ServerInfoServiceImpl.java   
* @Package： com.cfd.board.sub.server.service.impl   
* @Description: TODO(用一句话描述该文件做什么)   
*
* @version: v1.0.0
* @author: Chen WeiYu
* @date: 2019年2月22日 下午11:11:06 
*/
@Service
public class ServerInfoServiceImpl implements ServerInfoService{

	@Autowired
	private ServerInfoMapper serverInfoMapper;
	/**
	 * 根据id获取服务器信息
	 */
	@Override
	public ServerInfo getServerInfoById(int infoId) {
		return serverInfoMapper.selectByPrimaryKey(infoId);
	}

}
