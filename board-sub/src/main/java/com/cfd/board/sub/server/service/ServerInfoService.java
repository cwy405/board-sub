/**   
* @Title:  ServerInfoService.java   
* @Package： com.cfd.board.sub.server.service   
* @Description: TODO(用一句话描述该文件做什么)   
*
* @version: v1.0.0
* @author: Chen WeiYu
* @date: 2019年2月22日 下午11:09:33 
*/
package com.cfd.board.sub.server.service;

import com.cfd.board.sub.server.entitiy.ServerInfo;

/**   
* @Title:  ServerInfoService.java   
* @Package： com.cfd.board.sub.server.service   
* @Description: 服务器信息   
*
* @version: v1.0.0
* @author: Chen WeiYu
* @date: 2019年2月22日 下午11:09:33 
*/
public interface ServerInfoService {

	public ServerInfo getServerInfoById(int infoId);
}
