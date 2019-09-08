package com.trantrongnhan.Controller.Admin.api;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.stream.Collectors;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.trantrongnhan.DTO.BuildingDTO;
import com.trantrongnhan.Utils.HttpUtils;
import com.trantrongnhan.service.IBuildingService;
import com.trantrongnhan.service.impl.BuildingService;

@WebServlet(urlPatterns = { "/api-admin-building" })
public class BuildingAPI extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	IBuildingService buildingService=new BuildingService();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.getWriter().print("<p>Thành Công</p>");
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
        resp.setContentType("application/json");
		ObjectMapper objectMapper = new ObjectMapper();
		BuildingDTO obj=new BuildingDTO();
		System.out.println(req.getContextPath());
		System.out.println(req.getContentType());
		obj=HttpUtils.toModel(req.getReader(), obj);
		buildingService.insert(obj);
		objectMapper.writeValue(resp.getOutputStream(), obj);
		

	}

	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
        resp.setContentType("application/json");
		ObjectMapper objectMapper = new ObjectMapper();
		BuildingDTO obj=new BuildingDTO();
		obj=HttpUtils.toModel(req.getReader(), obj);
		buildingService.delete(obj.getListId());
		objectMapper.writeValue(resp.getOutputStream(), obj);
	}

	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
        resp.setContentType("application/json");
		ObjectMapper objectMapper = new ObjectMapper();
		BuildingDTO obj=new BuildingDTO();
		obj=HttpUtils.toModel(req.getReader(), obj);
		buildingService.update(obj);
		objectMapper.writeValue(resp.getOutputStream(), obj);
	}
}
