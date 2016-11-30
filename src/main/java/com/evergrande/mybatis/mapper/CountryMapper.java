package com.evergrande.mybatis.mapper;

import com.evergrande.mybatis.model.Country;
import com.evergrande.mybatis.util.MyMapper;
import com.piaoniu.pndao.annotations.DaoGen;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@DaoGen
public interface CountryMapper extends MyMapper<Country> {

    List<Country> queryByCountryname(@Param(value = "countryname") String countryname);
}