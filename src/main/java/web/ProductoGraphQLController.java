package web;

import com.app.ecom.inventarioservicegraphql.entitties.Producto;
import com.app.ecom.inventarioservicegraphql.repository.ProductoRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import java.util.List;
@Controller
public class ProductoGraphQLController {
    @Autowired
    private ProductoRepository productoRepository;

    private static Logger logger = LoggerFactory.getLogger(ProductoGraphQLController.class);
    @QueryMapping
    public List<Producto> listarProductos(){
        List<Producto> products = productoRepository.findAll();

        logger.debug("Mi mensaje debugg", products);

        return products;
    }
}
