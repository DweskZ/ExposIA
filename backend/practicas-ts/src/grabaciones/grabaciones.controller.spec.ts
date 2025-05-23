import { Test, TestingModule } from '@nestjs/testing';
import { GrabacionesController } from './grabaciones.controller';

describe('GrabacionesController', () => {
  let controller: GrabacionesController;

  beforeEach(async () => {
    const module: TestingModule = await Test.createTestingModule({
      controllers: [GrabacionesController],
    }).compile();

    controller = module.get<GrabacionesController>(GrabacionesController);
  });

  it('should be defined', () => {
    expect(controller).toBeDefined();
  });
});
