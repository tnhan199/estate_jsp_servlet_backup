package com.trantrongnhan.Controller.Admin;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.trantrongnhan.DTO.BuildingDTO;
import com.trantrongnhan.Utils.BeanUtils;
import com.trantrongnhan.Utils.HttpUtils;
import com.trantrongnhan.builder.BuildingBuilder;
import com.trantrongnhan.constant.BuildingType;
import com.trantrongnhan.constant.District;
import com.trantrongnhan.paging.PageRequest;
import com.trantrongnhan.paging.Pageable;
import com.trantrongnhan.service.impl.BuildingService;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

@WebServlet(urlPatterns = {"/admin-home"})
public class HomeController extends HttpServlet {
    /**
     *
     */

    private static final long serialVersionUID = 6997164515283054772L;
    public static BuildingService buildingService = null;

    public HomeController() {
        if (buildingService == null) {
            buildingService = new BuildingService();
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // TODO Auto-generated method stubs
        super.doPost(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // IBuildingService buildingService=new BuildingService();
        String view = "/views/admin/home.jsp";
        BuildingDTO buildingDTO = new BuildingDTO();
        List<District> l = new ArrayList<>();
        Pageable pageRequest = new PageRequest();
        BeanUtils.populate(pageRequest, req.getParameterMap());
        if (req.getParameter("type") != null && req.getParameter("type").equals("list")) {
            System.out.println(req.getContextPath());
            System.out.println(req.getContentType());
            view = "/views/admin/List.jsp";

            buildingDTO.setPage(pageRequest.getPage());
        }
        if (req.getParameter("type") != null && req.getParameter("type").equals("search")) {
            List<BuildingDTO> result;
            buildingDTO = BeanUtils.populate(buildingDTO, req.getParameterMap());
            if (pageRequest.getPage() != null && pageRequest.getPage() == 1) {
                result = buildingService.search(initBuildingBuilder(buildingDTO), null, null);
                Integer totalPage = result.size() / pageRequest.getMaxPageItem();
                if (result.size() % pageRequest.getMaxPageItem() != 0)
                    totalPage++;
                pageRequest.setTotalPage(totalPage);
            }
            buildingDTO.setPage(pageRequest.getPage());
            buildingDTO.setTotalPage(pageRequest.getTotalPage());

            result = buildingService.search(initBuildingBuilder(buildingDTO), pageRequest, null);
            buildingDTO.setListResult(result);
            view = "/views/admin/List.jsp";
            //System.out.println(result.size());
            String url = BeanUtils.getURLAPI(initBuildingBuilder(buildingDTO));
            //System.out.println(url);
            DefaultHttpClient httpClient = new DefaultHttpClient();
            HttpGet httpGet = new HttpGet(url);
            HttpResponse httpResponse=httpClient.execute(httpGet);
            ObjectMapper  objectMapper=new ObjectMapper();

            System.out.println(httpResponse.getEntity().toString());


        }
        if (req.getParameter("type") != null && req.getParameter("type").equals("insert")) {
            view = "/views/admin/building/edit.jsp";
            if (req.getParameter("id") != null && !req.getParameter("id").equals("")) {
                Integer id = Integer.valueOf(req.getParameter("id"));
                buildingDTO = buildingService.findById(id);
                if (buildingDTO.getType() != null)
                    buildingDTO.setBuildingTypes(buildingDTO.getType().split(","));
            }
        }
        l = Stream.of(District.values()).collect(Collectors.toList());
        List<BuildingType> listBuildingType = new ArrayList<>();
        listBuildingType = Stream.of(BuildingType.values()).collect(Collectors.toList());
        buildingDTO.setListDistrict(l);
        buildingDTO.setListBuildingType(listBuildingType);
        req.setAttribute("MODEL", buildingDTO);
        RequestDispatcher rd = req.getRequestDispatcher(view);
        rd.forward(req, resp);
    }

    public BuildingBuilder initBuildingBuilder(BuildingDTO buildingDTO) {
        return (new BuildingBuilder.Builder()).setName(buildingDTO.getName())
                .setBuildingArea(buildingDTO.getBuidingArea()).setBuildingTypes(buildingDTO.getBuildingTypes())
                .setDistrict(buildingDTO.getDistrict()).setManageName(buildingDTO.getManageName())
                .setManagePhone(buildingDTO.getManagePhone()).setRentAreaFrom(buildingDTO.getRentAreaFrom())
                .setRentAreaTo(buildingDTO.getRentAreaTo()).setRentCostFrom(buildingDTO.getRentCostFrom())
                .setRentCostTo(buildingDTO.getRentCostTo()).setStreet(buildingDTO.getStreet())
                .setWard(buildingDTO.getWard()).setNumberOfBasement(buildingDTO.getNumberOfBasement()).build();
    }

}
