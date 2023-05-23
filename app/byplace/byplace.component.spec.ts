import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ByplaceComponent } from './byplace.component';

describe('ByplaceComponent', () => {
  let component: ByplaceComponent;
  let fixture: ComponentFixture<ByplaceComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ByplaceComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ByplaceComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
