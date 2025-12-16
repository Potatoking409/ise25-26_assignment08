package de.seuhd.campuscoffee.domain.implementation;

import de.seuhd.campuscoffee.domain.ports.data.PosDataService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class CrudServiceTest {
    @Mock
    private PosDataService posDataService;
    @InjectMocks
    private PosServiceImpl posService;
    @Test
    void clearAllPos() {
        posService.clear();
        verify(posDataService).clear();
    }
}
