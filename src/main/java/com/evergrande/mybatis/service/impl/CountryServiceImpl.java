package com.evergrande.mybatis.service.impl;

import com.evergrande.mybatis.mapper.CountryMapper;
import com.evergrande.mybatis.model.Country;
import com.github.pagehelper.PageHelper;
import com.evergrande.mybatis.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.util.StringUtil;

import java.util.List;

/**
 * @author liuzh_3nofxnp
 * @since 2015-09-19 17:17
 */
@Service("countryService")
public class CountryServiceImpl extends BaseService<Country> implements CountryService {

    @Autowired
    private CountryMapper countryMapper;

    /*@Override
    public List<Country> selectByCountry(Country country, int page, int rows) {
        Example example = new Example(Country.class);
        Example.Criteria criteria = example.createCriteria();
        if (StringUtil.isNotEmpty(country.getCountryname())) {
            criteria.andLike("countryname", "%" + country.getCountryname() + "%");
        }
        if (StringUtil.isNotEmpty(country.getCountrycode())) {
            criteria.andLike("countrycode", "%" + country.getCountrycode() + "%");
        }
        if (country.getId() != null) {
            criteria.andEqualTo("id", country.getId());
        }
        //分页查询
        PageHelper.startPage(page, rows);
        return selectByExample(example);
    }*/

    @Override
    public List<Country> selectByCountry(Country country, int page, int rows) {
        //分页查询
        PageHelper.startPage(page, rows);

        List<Country> list = this.countryMapper.queryByCountryname(country.getCountryname());

        return list;
    }

}
