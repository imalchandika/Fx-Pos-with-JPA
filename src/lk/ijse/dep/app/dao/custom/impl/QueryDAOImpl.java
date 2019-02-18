package lk.ijse.dep.app.dao.custom.impl;

import lk.ijse.dep.app.dao.custom.QueryDAO;
import lk.ijse.dep.app.entity.CustomEntity;
import org.hibernate.Session;
import org.hibernate.query.Query;

import javax.persistence.EntityManager;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;


public class QueryDAOImpl implements QueryDAO {


    @Override
    public Optional<List<CustomEntity>> findOrderDetailsWithItemDescriptions(String orderId) throws Exception {
        return Optional.empty();
    }

    @Override
    public Optional<List<CustomEntity>> findAllOrdersWithCustomerNameAndTotal() throws Exception {
        return Optional.empty();
    }

    @Override
    public void setEntityManager(EntityManager em) {

    }
}
